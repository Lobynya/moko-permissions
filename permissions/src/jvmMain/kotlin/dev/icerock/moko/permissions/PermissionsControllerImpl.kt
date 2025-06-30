/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.permissions

@Suppress("TooManyFunctions")
class PermissionsControllerImpl() : PermissionsController {

    override suspend fun providePermission(permission: Permission) {

    }

    override suspend fun isPermissionGranted(permission: Permission): Boolean {
        return getPermissionState(permission) == PermissionState.Granted
    }

    @Suppress("ReturnCount")
    override suspend fun getPermissionState(permission: Permission): PermissionState {
        return PermissionState.Granted
    }



    override fun openAppSettings() {

    }


}
