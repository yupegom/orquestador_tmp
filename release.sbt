import sbtrelease.{ Version, _ }

// ---------------------
// Settings
// ---------------------

credentials += Credentials(Path.userHome / ".ach" / ".credentials")

pomIncludeRepository := { _ => false }

publishArtifact in Test := true

publishMavenStyle := true

publishTo := Option("S4N Nexus Snapshots Publish TO" at "http://nexus.seven4n.com/content/repositories/ach-binaries-snapshots/")

releaseCommitMessage := s"Definiendo siguiente version de desarrollo a ${version.value}"

releaseNextVersion := { ver => Version(ver).map(_.bumpBugfix.asSnapshot.string).getOrElse(versionFormatError) }

releaseTagComment := s"Liberando version de desarrollo ${version.value}"

releaseVersion := { ver => Version(ver).map(_.asSnapshot.string).getOrElse(versionFormatError) }

// -----------------------
// Custom settings
// -----------------------

