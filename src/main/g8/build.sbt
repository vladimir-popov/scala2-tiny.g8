lazy val `$name$` = (project in file("."))
  .settings(		
		organization := "$organization$",
    version := "0.1.0-SNAPSHOT",
		scalaVersion := "$scala_version$",
		scalacOptions += "-Ymacro-annotations",
		libraryDependencies ++= Seq(
			$if(cats.truthy)$
			"org.typelevel" %% "cats-core" % "$cats_version$",
			$endif$
			$if(cats_effect.truthy)$
		  "org.typelevel" %% "cats-effect" % "$cats_effect_version$",
			$endif$
			$if(fs2.truthy)$
			"co.fs2" %% "fs2-core" % "$fs2_version$",
			$endif$
			// tests:
      "org.scalatest"     %% "scalatest"       % "3.2.0"   % "test",
      "org.scalatestplus" %% "scalacheck-1-15" % "3.2.3.0" % "test"
		)
 	)

