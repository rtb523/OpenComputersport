package li.cil.oc.common

object PacketType extends Enumeration {
  val
  // Server -> Client
  AbstractBusState,
  Analyze,
  ChargerState,
  ColorChange,
  ComputerState,
  ComputerUserList,
  DisassemblerActiveChange,
  FileSystemActivity,
  FloppyChange,
  HologramClear,
  HologramColor,
  HologramPowerChange,
  HologramScale,
  HologramSet,
  HologramTranslation,
  PetVisibility, // Goes both ways.
  PowerState,
  PrinterState,
  RaidStateChange,
  RedstoneState,
  RobotAnimateSwing,
  RobotAnimateTurn,
  RobotAssemblingState,
  RobotInventoryChange,
  RobotLightChange,
  RobotMove,
  RobotSelectedSlotChange,
  RotatableState,
  SwitchActivity,
  TextBufferInit, // Goes both ways.
  TextBufferMulti,
  TextBufferMultiColorChange,
  TextBufferMultiCopy,
  TextBufferMultiDepthChange,
  TextBufferMultiFill,
  TextBufferMultiPaletteChange,
  TextBufferMultiResolutionChange,
  TextBufferMultiMaxResolutionChange,
  TextBufferMultiSet,
  TextBufferMultiRawSetText,
  TextBufferMultiRawSetBackground,
  TextBufferMultiRawSetForeground,
  TextBufferPowerChange,
  ScreenTouchMode,
  ServerPresence,
  Sound,
  SoundPattern,

  // Client -> Server
  ComputerPower,
  CopyToAnalyzer,
  DronePower,
  KeyDown,
  KeyUp,
  Clipboard,
  MouseClickOrDrag,
  MouseScroll,
  MouseUp,
  MultiPartPlace,
  RobotAssemblerStart,
  RobotStateRequest,
  ServerRange,
  ServerSide,
  ServerSwitchMode,

  EndOfList = Value
}