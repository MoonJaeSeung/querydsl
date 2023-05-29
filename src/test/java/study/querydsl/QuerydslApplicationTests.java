package study.querydsl;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Transactional
class QuerydslApplicationTests {

	@Autowired
	EntityManager em;


	@Test
	void contextLoads() {
	}

}
