/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at
         http://www.apache.org/licenses/LICENSE-2.0
       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */


package org.apache.cordova.navbar;

import android.content.pm.PackageManager;
import android.Manifest;
import android.os.Build;
import android.graphics.Color;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.apache.cordova.SystemBarPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.view.Window;
import androidx.core.view.WindowInsetsControllerCompat;


public class NavBar extends CordovaPlugin implements SystemBarPlugin.ICDVNavigationController {

    String TAG = "NavBar";


    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        return false;
    }

    public void update(WindowInsetsControllerCompat controller, boolean isColorLight, int color) {
        controller.setAppearanceLightNavigationBars(false);
        Window window = cordova.getActivity().getWindow();
        window.setNavigationBarColor(Color.RED);
    }
}
