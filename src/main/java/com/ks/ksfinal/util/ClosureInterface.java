package com.ks.ksfinal.util;
import java.util.List;

public interface ClosureInterface<S, T> {
	T execute(S srcModel);
}