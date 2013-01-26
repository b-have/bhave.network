/**
 * Copyright 2013 Davide Nunes
 * Authors : Davide Nunes <davex.pt@gmail.com>
 * Website : http://davidenunes.com 
 * 
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * This file is part of the b-have network library.
 * 
 * The b-have network library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The b-have network library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with the b-have network library.  
 * If not, see <http://www.gnu.org/licenses/gpl.html>.
 */
package org.bhave.network;

import org.bhave.network.api.Network;
import org.bhave.network.impl.hash.HashNetwork;

import com.google.inject.AbstractModule;

/**
 * <p>
 * This defines a <a href="http://code.google.com/p/google-guice"> GUICE </a>
 * module that handles the configuration of network library dependencies, hence
 * eliminating the need for factories in this library.
 * </p>
 * 
 * 
 * <p>
 * <h2>Getting a GUICE injector</h2>
 * To access multiple instances of our API objects such as a {@link Network
 * network} instance without accessing specific implementations, we build our
 * GUICE injector from this module like so: <br />
 * <br />
 *
 * <code>Injector injector = Guice.createInjector(new NetworkModule());</code>
 * 
 * </p>
 * 
 * <p>
 * From this point on you can get API objects like this: <br><br>
 * <code>Network network = injector.getInstance(Network.class);</code>
 * </p>
 * 
 * 
 * @author Davide Nunes
 */
public class NetworkModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Network.class).to(HashNetwork.class); // HashNetwork is an
													// implementation of Network
	}

}