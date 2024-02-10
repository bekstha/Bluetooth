package fi.metropolia.bibeks.bluetoothbeacon

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(rssi : Int) : BluetoothDeviceDomain{
    return BluetoothDeviceDomain(
        name = name,
        address = address,
        rssi = rssi
    )
}