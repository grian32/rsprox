package net.rsprox.protocol.v231.game.incoming.decoder.codec.players

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.incoming.model.players.OpPlayer
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v231.game.incoming.decoder.prot.GameClientProt

public class OpPlayer7Decoder : ProxyMessageDecoder<OpPlayer> {
    override val prot: ClientProt = GameClientProt.OPPLAYER7

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): OpPlayer {
        val index = buffer.g2Alt2()
        val controlKey = buffer.g1() == 1
        return OpPlayer(
            index,
            controlKey,
            7,
        )
    }
}
