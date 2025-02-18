package net.rsprox.protocol.v229.game.incoming.decoder.codec.objs

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.incoming.model.objs.OpObj
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v229.game.incoming.decoder.prot.GameClientProt

public class OpObj1Decoder : ProxyMessageDecoder<OpObj> {
    override val prot: ClientProt = GameClientProt.OPOBJ1

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): OpObj {
        val id = buffer.g2Alt2()
        val controlKey = buffer.g1Alt2() == 1
        val z = buffer.g2()
        val x = buffer.g2Alt2()
        return OpObj(
            id,
            x,
            z,
            controlKey,
            1,
        )
    }
}
