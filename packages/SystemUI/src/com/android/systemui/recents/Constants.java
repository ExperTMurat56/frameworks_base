/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.recents;

/**
 * Constants
 */
public class Constants {

    // TODO: Move into RecentsMetrics
    public static class Metrics {
        // DO NOT MODIFY THE ORDER OF THESE METRICS
        public static final int DismissSourceKeyboard = 0;
        public static final int DismissSourceSwipeGesture = 1;
        public static final int DismissSourceHeaderButton = 2;
    }

    // TODO: Move into RecentsDebugFlags
    public static class DebugFlags {

        public static class App {
            // Enables debug drawing for the transition thumbnail
            public static final boolean EnableTransitionThumbnailDebugMode = false;
            // Enables the filtering of tasks according to their grouping
            public static final boolean EnableTaskFiltering = false;
            // Enables dismiss-all
            public static final boolean EnableDismissAll = false;
            // Enables fast-toggling by just tapping on the recents button
            public static final boolean EnableFastToggleRecents = false;
            // Enables the thumbnail alpha on the front-most task
            public static final boolean EnableThumbnailAlphaOnFrontmost = false;
            // This disables the search bar integration
            public static final boolean DisableSearchBar = true;
            // This disables the bitmap and icon caches
            public static final boolean DisableBackgroundCache = false;
            // Enables the simulated task affiliations
            public static final boolean EnableSimulatedTaskGroups = false;
            // Defines the number of mock task affiliations per group
            public static final int TaskAffiliationsGroupCount = 12;
            // Enables us to create mock recents tasks
            public static final boolean EnableSystemServicesProxy = false;
            // Defines the number of mock recents packages to create
            public static final int SystemServicesProxyMockPackageCount = 3;
            // Defines the number of mock recents tasks to create
            public static final int SystemServicesProxyMockTaskCount = 100;
        }
    }
}
