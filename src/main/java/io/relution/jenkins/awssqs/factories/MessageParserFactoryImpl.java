/*
 * Copyright 2016 M-Way Solutions GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.relution.jenkins.awssqs.factories;

import com.amazonaws.services.sqs.model.Message;

import io.relution.jenkins.awssqs.interfaces.MessageParser;
import io.relution.jenkins.awssqs.model.CodeCommitMessageParser;


public class MessageParserFactoryImpl implements io.relution.jenkins.awssqs.interfaces.MessageParserFactory {

    @Override
    public MessageParser createParser(final Message message) {
        return this.createCodeCommitParser();
    }

    @Override
    public MessageParser createCodeCommitParser() {
        return new CodeCommitMessageParser();
    }
}
