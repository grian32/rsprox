package net.rsprox.protocol.v228.game.incoming.decoder.codec.objs

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.game.incoming.model.objs.OpObj
import net.rsprox.protocol.v228.game.incoming.decoder.prot.GameClientProt
import net.rsprox.protocol.ProxyMessageDecoder

public class OpObj2Decoder : ProxyMessageDecoder<OpObj> {
    override val prot: ClientProt = GameClientProt.OPOBJ2

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): OpObj {
        val id = buffer.g2Alt3()
        val x = buffer.g2Alt3()
        val z = buffer.g2()
        val controlKey = buffer.g1() == 1
        return OpObj(
            id,
            x,
            z,
            controlKey,
            2,
        )
    }
}
