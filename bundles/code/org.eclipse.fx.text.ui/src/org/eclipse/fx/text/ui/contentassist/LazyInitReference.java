package org.eclipse.fx.text.ui.contentassist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LazyInitReference<Type> {

	private Supplier<Type> factory;
	private Type ref = null;

	private List<Consumer<Type>> lazyInit = new ArrayList<>();

	public void init(Consumer<Type> initializer) {
		if (this.ref != null) {
			initializer.accept(this.ref);
		}
		this.lazyInit.add(initializer);
	}

	public void setFactory(Supplier<Type> factory) {
		this.factory = factory;
	}

	public Type get() {
		if (this.factory == null) throw new IllegalStateException("Not yet ready, factory needs to be set!");
		if (this.ref == null) {
			this.ref = this.factory.get();
			this.lazyInit.forEach(i -> i.accept(this.ref));
		}
		return this.ref;
	}

	public void clean() {
		this.ref = null;
	}

	public boolean isInitialized() {
		return this.ref != null;
	}
}
