
package com.option.chain.analysis;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.option.chain.analysis.model.OpJsonData;
import com.option.chain.analysis.repository.OptionChainRepository;

@SpringBootApplication
@DataJpaTest
class OptionChainAnalysisApplicationTests {

	@Autowired
	OptionChainRepository optionChainRepository;
	
	
	
	
	@Test
	void testSave() {
	
		 //List<OpJsonData> result = optionChainRepository.
		
	}

}
