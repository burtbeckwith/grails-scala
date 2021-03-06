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

package grails_scala_test

/** Sample base class */
// sealed abstract class Point[T]
sealed trait Point[T]

/** Sample case class for a Point in a for geo-referentiation
 * Note that here I define its attributes as mutable (with related accessors generated,
 * and this is not a best practice), but just to try even this.
 */
case class Point2dGeo[T](var lon: T, var lat: T) extends Point[T]


/** Sample case class for a Point in a 2d cartesian coordinate system */
case class Point2d[T](x: T, y: T) extends Point[T]

/** Sample case class for a Point in a 3d cartesian coordinate system */
case class Point3d[T](x: T, y: T, z: T) extends Point[T]


/** Sample case class for a Screen Point, with color */
case class ScreenPoint(x: Int, y: Int, color: java.awt.Color) extends Point[Int]
