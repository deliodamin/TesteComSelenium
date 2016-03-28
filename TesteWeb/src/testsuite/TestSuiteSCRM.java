package testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import testcase.TestFull;
import testcase.TesteLogin;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TesteLogin.class, TestFull.class,
})
public class TestSuiteSCRM {
}
