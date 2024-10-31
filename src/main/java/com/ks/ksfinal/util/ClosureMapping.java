/*
package com.ks.ksfinal.util;
import java.util.TreeMap;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import in.util.MapOfMap.TT;

@Component
public class ClosureMapping<S,T> {
	private final TreeMap<String, TreeMap<String, ClosureInterface<? extends Object,? extends Object> >> level2Map = new TreeMap<>();
	private final TT<String, String, ClosureInterface<? extends Object,? extends Object>> l2map = new TT<>();
	
	@Autowired
	ApplicationContext applicationContext;
	
	public ClosureMapping()
	{
	}
	
	@PostConstruct
	public void init() {
		RegistrationMappingConstants.mapRegistrationPageOperMap(l2map, applicationContext);
	}
	
	@SuppressWarnings("unchecked")
	public ClosureInterface<S,T> retrieveClosure(String page, String operation) {
		ClosureInterface<S,T> closureInterface = (ClosureInterface<S,T>) l2map.get(page, operation);
		return closureInterface;
	}
	
}

 */