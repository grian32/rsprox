package net.rsprox.protocol.v230.game.outgoing.decoder.codec.zone.payload

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.model.zone.payload.ObjDel
import net.rsprox.protocol.game.outgoing.model.zone.payload.util.CoordInZone
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v230.game.outgoing.decoder.prot.GameServerProt

internal class ObjDelDecoder : ProxyMessageDecoder<ObjDel> {
    override val prot: ClientProt = GameServerProt.OBJ_DEL

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): ObjDel {
        val coordInZone = CoordInZone(buffer.g1Alt3())
        val quantity = buffer.g4Alt1()
        val id = buffer.g2Alt1()
        return ObjDel(
            id,
            quantity,
            coordInZone,
        )
    }
}
