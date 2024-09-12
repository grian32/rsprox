package net.rsprox.protocol.game.outgoing.decoder.codec.zone.payload

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.decoder.prot.GameServerProt
import net.rsprox.protocol.game.outgoing.model.zone.payload.ObjDel
import net.rsprox.protocol.game.outgoing.model.zone.payload.util.CoordInZone
import net.rsprox.protocol.session.Session

public class ObjDelDecoder : ProxyMessageDecoder<ObjDel> {
    override val prot: ClientProt = GameServerProt.OBJ_DEL

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): ObjDel {
        val id = buffer.g2()
        val coordInZone = CoordInZone(buffer.g1Alt3())
        val quantity = buffer.g4Alt2()
        return ObjDel(
            id,
            quantity,
            coordInZone,
        )
    }
}
