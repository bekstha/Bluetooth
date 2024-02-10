package fi.metropolia.bibeks.bluetoothbeacon

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList()
)
