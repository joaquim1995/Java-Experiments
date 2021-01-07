// tag::comment[]
/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - Initial implementation
 *******************************************************************************/
// end::comment[]
package org.dip.multimodule.java.business.impl;

import org.dip.multimodule.java.business.api.DummyService;

import javax.ejb.Stateless;
import java.util.Random;

@Stateless
public class DummyEjb implements DummyService
{
    @Override
    public Integer obtainValue() {
        return new Random().nextInt();
    }

    public static Integer obtainValueStatic() {
        return new Random().nextInt();
    }

}
