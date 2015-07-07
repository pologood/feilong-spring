/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.spring.context;

import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.feilong.core.tools.jsonlib.JsonUtil;

/**
 * The Class ApplicationContextUtilTest.
 *
 * @author feilong
 * @version 1.0.8 2014年11月30日 上午3:36:58
 * @since 1.0.8
 */
@ContextConfiguration(locations = { "classpath:spring-DI.xml" })
public class ApplicationContextUtilTest extends AbstractJUnit4SpringContextTests{

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationContextUtilTest.class);

    /**
     * Test.
     */
    @Test
    public final void test(){
        Map<String, Object> applicationContextForLogMap = ApplicationContextUtil.getApplicationContextForLogMap(applicationContext);
        LOGGER.debug("ApplicationContextForLogMap:{}", JsonUtil.format(applicationContextForLogMap));
        LOGGER.info("" + applicationContext.containsBean("paymentAdaptorFactory"));
    }
}
