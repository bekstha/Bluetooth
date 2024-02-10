package fi.metropolia.bibeks.bluetoothbeacon

typealias BluetoothDeviceDomain = BluetoothDevice

data class BluetoothDevice(
    val name: String?,
    val address: String,
    val rssi: Int
)