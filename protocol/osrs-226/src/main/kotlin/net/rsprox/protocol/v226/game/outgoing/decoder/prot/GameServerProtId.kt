package net.rsprox.protocol.v226.game.outgoing.decoder.prot

internal object GameServerProtId {
    const val CAM_MODE = 0
    const val CLANSETTINGS_DELTA = 1
    const val OBJ_CUSTOMISE = 2
    const val IF_SETPLAYERMODEL_BASECOLOUR = 3
    const val CAM_MOVETO_ARC = 4
    const val UPDATE_REBOOT_TIMER = 5
    const val MIDI_SONG_V2 = 6
    const val PLAYER_ANIM_SPECIFIC = 7
    const val LOGOUT_WITHREASON = 8
    const val REBUILD_REGION = 9
    const val CHAT_FILTER_SETTINGS = 10
    const val UPDATE_ZONE_PARTIAL_FOLLOWS = 11
    const val TRIGGER_ONDIALOGABORT = 12
    const val SITE_SETTINGS = 13
    const val UPDATE_RUNWEIGHT = 14
    const val MAP_ANIM_SPECIFIC = 15
    const val VARP_RESET = 16
    const val OBJ_ENABLED_OPS = 17
    const val MESSAGE_PRIVATE_ECHO = 18
    const val SET_PLAYER_OP = 19
    const val UPDATE_STAT_V1 = 20
    const val MESSAGE_FRIENDCHANNEL = 21
    const val CAM_LOOKAT_EASED_COORD = 22
    const val UPDATE_ZONE_FULL_FOLLOWS = 23
    const val UPDATE_INV_PARTIAL = 24
    const val IF_CLOSESUB = 25
    const val UPDATE_INV_FULL = 26
    const val CLANCHANNEL_FULL = 27
    const val OCULUS_SYNC = 28
    const val IF_OPENSUB = 29
    const val CLANCHANNEL_DELTA = 30
    const val UPDATE_ZONE_PARTIAL_ENCLOSED = 31
    const val UPDATE_RUNENERGY = 32
    const val CAM_TARGET_V2 = 33
    const val IF_SETPLAYERMODEL_BODYTYPE = 34
    const val LOC_ADD_CHANGE_V1 = 35
    const val UPDATE_IGNORELIST = 36
    const val LOC_MERGE = 37
    const val SET_HEATMAP_ENABLED = 38
    const val CAM_LOOKAT = 39
    const val CAM_MOVETO_CYCLES = 40
    const val VARCLAN_ENABLE = 41
    const val IF_SETNPCHEAD_ACTIVE = 42
    const val OBJ_DEL = 43
    const val IF_SETPLAYERMODEL_SELF = 44
    const val MIDI_SONG_STOP = 45
    const val OBJ_ADD = 46
    const val MESSAGE_GAME = 47
    const val PROJANIM_SPECIFIC_V2 = 48
    const val UPDATE_FRIENDCHAT_CHANNEL_FULL_V1 = 49
    const val VARP_LARGE = 50
    const val VARP_SYNC = 51
    const val PROJANIM_SPECIFIC_V1 = 52
    const val LOC_ANIM_SPECIFIC = 53
    const val UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER = 54
    const val UPDATE_STOCKMARKET_SLOT = 55
    const val MIDI_JINGLE = 56
    const val IF_SETHIDE = 57
    const val IF_SETCOLOUR = 58
    const val IF_SETMODEL = 59
    const val CAM_SHAKE = 60
    const val UPDATE_UID192 = 61
    const val RESET_ANIMS = 62
    const val PLAYER_INFO = 63
    const val OBJ_UNCUSTOMISE = 64
    const val NPC_INFO_LARGE_V4 = 65
    const val IF_SETEVENTS_V1 = 66
    const val IF_SETPLAYERMODEL_OBJ = 67
    const val LOGOUT = 68
    const val VARCLAN_DISABLE = 69
    const val UPDATE_STAT_V2 = 70
    const val IF_MOVESUB = 71
    const val UPDATE_INV_STOPTRANSMIT = 72
    const val SYNTH_SOUND = 73
    const val LOC_DEL = 74
    const val HISCORE_REPLY = 75
    const val CAM_SMOOTHRESET = 76
    const val UPDATE_TRADINGPOST = 77
    const val REFLECTION_CHECKER = 78
    const val IF_SETPLAYERHEAD = 79
    const val LOC_ANIM = 80
    const val NPC_ANIM_SPECIFIC = 81
    const val CHAT_FILTER_SETTINGS_PRIVATECHAT = 82
    const val NPC_SPOTANIM_SPECIFIC = 83
    const val MIDI_SONG_V1 = 84
    const val FRIENDLIST_LOADED = 85
    const val MESSAGE_CLANCHANNEL_SYSTEM = 86
    const val NPC_INFO_SMALL_V4 = 87
    const val VARCLAN = 88
    const val MAP_ANIM = 89
    const val CLANSETTINGS_FULL = 90
    const val IF_SETSCROLLPOS = 91
    const val SOUND_AREA = 92
    const val IF_SETTEXT = 93
    const val MIDI_SWAP = 94
    const val HINT_ARROW = 95
    const val MINIMAP_TOGGLE = 96
    const val RUNCLIENTSCRIPT = 97
    const val MESSAGE_CLANCHANNEL = 98
    const val URL_OPEN = 99
    const val OBJ_COUNT = 100
    const val VARP_SMALL = 101
    const val SERVER_TICK_END = 102
    const val LOGOUT_TRANSFER = 103
    const val CAM_MOVETO = 104
    const val UPDATE_FRIENDCHAT_CHANNEL_FULL_V2 = 105
    const val IF_CLEARINV = 106
    const val IF_SETANIM = 107
    const val CAM_ROTATETO = 108
    const val REBUILD_NORMAL = 109
    const val IF_OPENTOP = 110
    const val NPC_HEADICON_SPECIFIC = 111
    const val SET_MAP_FLAG = 112
    const val IF_SETROTATESPEED = 113
    const val IF_SETOBJECT = 114
    const val IF_SETNPCHEAD = 115
    const val PLAYER_SPOTANIM_SPECIFIC = 116
    const val IF_SETPOSITION = 117
    const val SEND_PING = 118
    const val IF_RESYNC_V1 = 119
    const val MIDI_SONG_WITHSECONDARY = 120
    const val CAM_RESET = 121
    const val UPDATE_FRIENDLIST = 122
    const val MAP_PROJANIM_V1 = 123
    const val IF_SETANGLE = 124
    const val CAM_ROTATEBY = 125
    const val CAM_TARGET_V1 = 126
    const val MESSAGE_PRIVATE = 127
    const val RESET_INTERACTION_MODE = 128
    const val SET_NPC_UPDATE_ORIGIN = 129
    const val REBUILD_WORLDENTITY_V2 = 130
    const val SET_ACTIVE_WORLD_V1 = 131
    const val CLEAR_ENTITIES = 132
    const val HIDEOBJOPS = 133
    const val WORLDENTITY_INFO_V1 = 134
    const val PROJANIM_SPECIFIC_V3 = 135
    const val UNKNOWN_STRING = 136
    const val SET_INTERACTION_MODE = 137
    const val HIDELOCOPS = 138
    const val NPC_INFO_SMALL_V5 = 139
    const val WORLDENTITY_INFO_V3 = 140
    const val HIDENPCOPS = 141
    const val WORLDENTITY_INFO_V2 = 142
    const val NPC_INFO_LARGE_V5 = 143
}
