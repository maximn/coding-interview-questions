name := "coding-interview-questions"

version := "1.0"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.10.0" % "test",
                            "org.specs2" %% "specs2-scalacheck" % "3.10.0" % "test")

scalacOptions in Test ++= Seq("-Yrangepos")