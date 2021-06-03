package ro.ase.cts.teste.suite;

import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestCase;
import ro.ase.cts.teste.GrupaFakeTest;
import ro.ase.cts.teste.TestCaseStub;
import ro.ase.cts.teste.categorii.TesteNormale;
import ro.ase.cts.teste.categorii.TesteUrgente;

@RunWith(Suite.class)
@SuiteClasses({GrupaFakeTest.class,
	TestCaseStub.class,
	})
@IncludeCategory({TesteUrgente.class})
@ExcludeCategory({TesteNormale.class})
public class AllTests {

}
