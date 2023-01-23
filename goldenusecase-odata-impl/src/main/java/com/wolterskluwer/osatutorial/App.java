package com.wolterskluwer.osatutorial;

import com.wolterskluwer.osa.identity.odata.api.Authenticate;
import com.wolterskluwer.osa.identity.odata.api.Product;
import com.wolterskluwer.osa.identity.odata.client.IdentityODataClient;
import com.wolterskluwer.osa.identity.odata.client.entityset.ProductEntitySet;
import com.wolterskluwer.osa.identity.odata.client.operationset.AuthenticationOperationSet;
import com.wolterskluwer.osa.referencedomain.odata.api.Operation2;
import com.wolterskluwer.osa.referencedomain.odata.client.ReferencedomainODataClient;
import com.wolterskluwer.osa.referencedomain.odata.client.operationset.Service1OperationSet;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        GenericXmlApplicationContext refContext = new GenericXmlApplicationContext("context.xml");

        Service1OperationSet service1OperationSet = refContext.getAutowireCapableBeanFactory().getBean(ReferencedomainODataClient.class).getService1OperationSet();

        Integer integer = service1OperationSet.operation2(new Operation2());
        System.out.println(integer);


    }
}
