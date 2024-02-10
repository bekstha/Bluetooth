package fi.metropolia.bibeks.bluetoothbeacon

import kotlinx.coroutines.flow.StateFlow

interface BluetoothController {
    val scannedDevices : StateFlow<List<BluetoothDevice>>

    fun startDiscovery()

    fun stopDiscovery()

    fun release()
}