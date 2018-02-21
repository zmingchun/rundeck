/*
 * Copyright 2016 SimplifyOps, Inc. (http://simplifyops.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtolabs.rundeck.core.plugins;

import java.io.File;
import java.util.Date;
import java.util.Map;

/**
 * Provides metadata about plugin files
 */
public interface PluginMetadata {
    /**
     * @return Name of file on disk
     */
    default String getFilename() {
        return null;
    }

    /**
     * @return Source file on disk
     */
    default File getFile() {
        return null;
    }

    /**
     * @return author metadata
     */
    default String getPluginAuthor() {
        return null;
    }

    /**
     * @return plugin file version
     */
    default String getPluginFileVersion(){
        return null;
    }

    /**
     * @return rundeck plugin format version
     */
    default String getPluginVersion(){
        return null;
    }

    /**
     * @return plugin URL
     */
    default String getPluginUrl() {
        return null;
    }

    /**
     * @return build date of plugin
     */
    default Date getPluginDate() {
        return null;
    }

    /**
     * @return date loaded
     */
    Date getDateLoaded();

    default Map getMeta() {
        return null;
    }

}
