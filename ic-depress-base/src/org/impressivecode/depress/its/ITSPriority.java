/*
ImpressiveCode Depress Framework
Copyright (C) 2013  ImpressiveCode contributors

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.impressivecode.depress.its;

import java.util.Arrays;

/**
 * 
 * @author Marek Majchrzak, ImpressiveCode
 * 
 */
public enum ITSPriority {
    TRIVIAL("Trivial"), MINOR("Minor"), MAJOR("Major"),
    CRITICAL("Critical"), BLOCKER("Blocker"), UNKNOWN("Unknown");
    
    private final String label;
    
	private ITSPriority(final String label) {
    	this.label = label;
    }
	
    @Override
    public String toString() {
        return (this.name().substring(0, 1).toUpperCase() +  this.name().substring(1).toLowerCase()).replaceAll("_", " ");
    }
    
	public String getLabel() {
		return label;
	}
	
	public static String[] labels() {
	    return Arrays.toString(ITSPriority.values()).replaceAll("^.|.$", "").split(", ");
	}

}
