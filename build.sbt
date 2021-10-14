name := "math-calc-zio"

version := "0.1"

scalaVersion := "3.0.2"

//zio
val zioVersion = "2.0.0-M3"
libraryDependencies ++= Seq (
  "dev.zio"  %% "zio"          % zioVersion,
  "dev.zio"  %% "zio-test"     % zioVersion % "test",
  "dev.zio"  %% "zio-test-sbt" % zioVersion % "test"
)

libraryDependencies ++= Seq (
  "io.d11" %% "zhttp" % "1.0.0.0-RC17"
)
