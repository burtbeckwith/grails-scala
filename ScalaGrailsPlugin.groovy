/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class ScalaGrailsPlugin {
    def version = "2.11.5"
    def grailsVersion = "2.2 > *"
    def title = "Scala Plugin"
    def author = "Sandro Martini, originally developed by Vaclav Pech and Domingo Suarez Torres"
    def authorEmail = "sandro.martini@gmail.com"
    def description = "Compiles Scala sources located under src/scala and src/java before Grails kicks in with the Grails compilation"

    def documentation = "http://smartiniongithub.github.com/grails-scala/"

    def license = "APACHE"
    def issueManagement = [ system: "github", url: "https://github.com/smartiniOnGitHub/grails-scala/issues/" ]
    def scm = [ url: "https://github.com/smartiniOnGitHub/grails-scala/" ]

    def pluginExcludes = [
		'**/Thumbs.db',
        'src/docs/**',
        'src/groovy/grails_scala_test/**',
        'src/java/grails_scala_test/**',
        'src/scala/grails_scala_test/**'
    ]

    def developers = [
        [name: "Vaclav Pech"],
        [name: "Domingo Suarez Torres", email: "domingo.suarez@gmail.com" ],
        [name: "Sandro Martini", email: "sandro.martini@gmail.com"],
    ]
}
