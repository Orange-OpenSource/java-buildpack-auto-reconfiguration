/*
 * Copyright 2011-2014 the original author or authors.
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

package org.cloudfoundry.reconfiguration.spring;

import org.cloudfoundry.reconfiguration.util.CloudUtils;

import java.util.Arrays;
import java.util.List;

final class HibernateCloudServiceBeanFactoryPostProcessor extends
        AbstractHibernateBasedCloudServiceBeanFactoryPostProcessor {

    private static final List<String> BEAN_CLASSES = Arrays.asList(
            "org.springframework.orm.hibernate3.AbstractSessionFactoryBean",
            "org.springframework.orm.hibernate4.LocalSessionFactoryBean");

    private static final String PROPERTY_NAME = "hibernateProperties";

    HibernateCloudServiceBeanFactoryPostProcessor(CloudUtils cloudUtils) {
        super(BEAN_CLASSES, cloudUtils, PROPERTY_NAME);
    }

}
