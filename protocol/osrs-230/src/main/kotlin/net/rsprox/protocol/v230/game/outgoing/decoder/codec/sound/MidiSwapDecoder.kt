package net.rsprox.protocol.v230.game.outgoing.decoder.codec.sound

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.model.sound.MidiSwap
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v230.game.outgoing.decoder.prot.GameServerProt

internal class MidiSwapDecoder : ProxyMessageDecoder<MidiSwap> {
    override val prot: ClientProt = GameServerProt.MIDI_SWAP

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): MidiSwap {
        val fadeOutDelay = buffer.g2()
        val fadeInDelay = buffer.g2()
        val fadeInSpeed = buffer.g2Alt3()
        val fadeOutSpeed = buffer.g2Alt3()
        return MidiSwap(
            fadeOutDelay,
            fadeOutSpeed,
            fadeInDelay,
            fadeInSpeed,
        )
    }
}
