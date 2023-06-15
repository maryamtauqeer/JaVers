package com.maryamt.JaversProject1;

import com.maryamt.JaversProject1.Entities.Product;
import com.maryamt.JaversProject1.Entities.Store;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;
import org.javers.core.diff.changetype.ValueChange;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.javers.core.diff.ListCompareAlgorithm.LEVENSHTEIN_DISTANCE;

@SpringBootTest
class JaversProject1ApplicationTests {

	@Test
	void contextLoads() {
	}

//	public void shouldCompareTwoEntities() {
//		Javers javers = JaversBuilder.javers().build();
//
//		Store store = new Store();
//		store.setName("Maryam's Store woo");
//		for (int i = 1; i < 3; i++) {
//			Product product = new Product();
//			product.setName("Prod 1");
//			product.setPrice(15);
//			product.setStore(store);
//			store.addProduct(product);
//		}
//
//
//
//		// when
//		Diff diff = javers.compare(store, store2);
//
//		// then
//		ValueChange change = diff.getChangesByType(ValueChange.class).get(0);
//
//		assertThat(diff.getChanges()).hasSize(1);
//		assertThat(change.getPropertyName()).isEqualTo("name");
//		assertThat(change.getLeft()).isEqualTo("Michael Program");
//		assertThat(change.getRight()).isEqualTo("Michael Java");
//	}
//	}

}
