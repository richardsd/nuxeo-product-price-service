package pt.inevo.nuxeo.product.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.ecm.platform.test.PlatformFeature;
import org.nuxeo.runtime.test.runner.Deploy;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;

import com.google.inject.Inject;

@RunWith(FeaturesRunner.class)
@Features({ PlatformFeature.class })
@Deploy("pt.inevo.nuxeo.product.service.nuxeo-product-service")
public class TestProductService {

    @Inject
    protected ProductService productService;

    @Test
    public void testService() {
        assertNotNull(productService);
    }
}
