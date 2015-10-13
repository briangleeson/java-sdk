/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.watson.developer_cloud.visual_insights.v1;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ibm.watson.developer_cloud.WatsonServiceTest;
import com.ibm.watson.developer_cloud.visual_insights.v1.VisualInsights;
import com.ibm.watson.developer_cloud.visual_insights.v1.model.Classifiers;
import com.ibm.watson.developer_cloud.visual_insights.v1.model.Summary;

/**
 * @author Nizar Alseddeg (nmalsedd@us.ibm.com)
 */
public class VisualInsightsTest extends WatsonServiceTest {

    /** The service. */
    private VisualInsights service;


    /* (non-Javadoc)
	 * @see com.ibm.watson.developer_cloud.WatsonServiceTest#setUp()
	 */
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        service = new VisualInsights();
        service.setUsernameAndPassword(
                prop.getProperty("visual_insights.username"),
                prop.getProperty("visual_insights.password")
        );
        service.setEndPoint(prop.getProperty("visual_insights.url"));
    }

    /**
     * Test get GetClassifiersFilterByName.
     */
    @Test
    public void testGetClassifiers() {
        Classifiers classifiers = service.getClassifiers();
        Assert.assertNotNull(classifiers);
    }
    /**
     * Test get GetClassifiersFilterByName.
     */
    @Test
    public void testGetClassifiersFilterByName() {
        Classifiers classifiers = service.getClassifiers("animal");
        Assert.assertNotNull(classifiers);
    }
    /**
     * Test get testGetAccounts.
     */
    @Test
    public void testGetSummary() {
        File images = new File("src/test/resources/images.zip");
        Summary summary = service.getSummary(images);
        Assert.assertNotNull(summary);
    }


}