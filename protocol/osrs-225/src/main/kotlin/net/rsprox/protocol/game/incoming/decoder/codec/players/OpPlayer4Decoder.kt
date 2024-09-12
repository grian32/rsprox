package net.rsprox.protocol.game.incoming.decoder.codec.players

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.incoming.decoder.prot.GameClientProt
import net.rsprox.protocol.game.incoming.model.players.OpPlayer
import net.rsprox.protocol.session.Session

public class OpPlayer4Decoder : ProxyMessageDecoder<OpPlayer> {
    override val prot: ClientProt = GameClientProt.OPPLAYER4

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): OpPlayer {
        val index = buffer.g2()
        val controlKey = buffer.g1Alt3() == 1
        return OpPlayer(
            index,
            controlKey,
            4,
        )
    }
}
