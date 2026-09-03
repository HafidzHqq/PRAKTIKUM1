package com.example.praktikum1

class JVMPlatform: Platform {
    override val name: String = "Desktop JVM"
}

actual fun getPlatform(): Platform = JVMPlatform()