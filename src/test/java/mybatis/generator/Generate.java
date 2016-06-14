package mybatis.generator;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
/**
 * 执行该程序根据相应的xml配置文件生成PO、mapper
 * @author demon7452
 *
 */
public class Generate {
	public static void main(String[] args) {
		List<String> warnings = new ArrayList<String>();
		try {
			boolean overwrite = true;
			File configFile = new File("./src/test/java/mybatis/generator/generate_all.xml");
//			File configFile = new File("./src/test/java/mybatis/generator/generate_divide.xml");
			if (configFile.exists()) {
				ConfigurationParser cp = new ConfigurationParser(warnings);
				Configuration config = cp.parseConfiguration(configFile);
				for (Context context : config.getContexts()) {
					context.addProperty("overwrite", String.valueOf(overwrite));
				}
				DefaultShellCallback callback = new DefaultShellCallback(overwrite);
				MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
				myBatisGenerator.generate(null);
				System.out.println("Success");
			} else
				System.out.println("配置文件不存在");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
