package net.rsprox.protocol.v231.game.incoming.decoder.codec.objs

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.incoming.model.objs.OpObj6
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v231.game.incoming.decoder.prot.GameClientProt

public class OpObj6Decoder : ProxyMessageDecoder<OpObj6> {
    override val prot: ClientProt = GameClientProt.OPOBJ6

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): OpObj6 {
        val z = buffer.g2()
        val id = buffer.g2()
        val x = buffer.g2Alt3()
        return OpObj6(
            id,
            x,
            z,
        )
    }
}
