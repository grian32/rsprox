package net.rsprox.protocol.v231.game.incoming.decoder.codec.npcs

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.incoming.model.npcs.OpNpc
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v231.game.incoming.decoder.prot.GameClientProt

public class OpNpc5Decoder : ProxyMessageDecoder<OpNpc> {
    override val prot: ClientProt = GameClientProt.OPNPC5

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): OpNpc {
        val controlKey = buffer.g1Alt1() == 1
        val index = buffer.g2Alt2()
        return OpNpc(
            index,
            controlKey,
            5,
        )
    }
}
