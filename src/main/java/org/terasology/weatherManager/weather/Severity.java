/*
 * Copyright 2015 MovingBlocks
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
package org.terasology.weatherManager.weather;

/**
* Created by Linus on 15-2-2015.
*/
public enum Severity {
    NONE("none",  0.00f),
    LIGHT("light", 0.33f),
    MODERATE("moderate", 0.66f),
    HEAVY("heavy", 1.00f);

    private final String string;
    private final float numericValue;

    private Severity(String string, float numericValue) {
        this.string = string;
        this.numericValue = numericValue;
    }

    @Override
    public String toString() {
        return string;
    }
}
