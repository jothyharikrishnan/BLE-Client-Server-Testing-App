package com.example.bleclientservertestingproject

import java.util.UUID

val CTF_SERVICE_UUID: UUID = UUID.fromString("8c380000-10bd-4fdb-ba21-1922d6cf860d")
val PASSWORD_CHARACTERISTIC_UUID: UUID = UUID.fromString("8c380001-10bd-4fdb-ba21-1922d6cf860d")
val NAME_CHARACTERISTIC_UUID: UUID = UUID.fromString("8c380002-10bd-4fdb-ba21-1922d6cf860d")


//These fields are marked as API >= 31 in the Manifest class, so we can't use those without warning.
//So we create our own, which prevents over-suppression of the Linter
const val PERMISSION_BLUETOOTH_ADVERTISE = "android.permission.BLUETOOTH_ADVERTISE"
const val PERMISSION_BLUETOOTH_CONNECT = "android.permission.BLUETOOTH_CONNECT"
const val PERMISSION_BLUETOOTH_SCAN = "android.permission.BLUETOOTH_SCAN"
