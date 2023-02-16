package ch.ivyteam.windows.launcher.modifier;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.util.Arrays;

import org.apache.maven.model.FileSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class TestModifyStringResourcesMojo {

  @Test
  void execute(@TempDir File tempFolder) throws Exception {
    var mojo = new ModifyStringResourcesMojo();
    mojo.inputFiles = new FileSet();
    mojo.inputFiles.setDirectory("src/test/resources/testLaunchers");
    mojo.inputFiles.setIncludes(Arrays.asList("*.exe", "*.dll"));
    mojo.outputDirectory = tempFolder;
    mojo.productVersion = "7.2.0.62d6898";
    mojo.execute();
    assertThat(new File(tempFolder, "AxonIvyEngine.exe")).exists();
    assertThat(new File(tempFolder, "JVMLauncher.dll")).exists();
  }
}
