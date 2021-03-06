/*
 *  Copyright (C) 2015 JPEXS, All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library. */
package com.jpexs.debugger.flash;

/**
 *
 * @author JPEXS
 */
public interface VariableType {

    public static final int NUMBER = 0;
    public static final int BOOLEAN = 1;
    public static final int STRING = 2;
    public static final int OBJECT = 3;
    public static final int FUNCTION = 4;
    public static final int MOVIECLIP = 5;
    public static final int NULL = 6;
    public static final int UNDEFINED = 7;
    public static final int UNKNOWN = 8;
}
