# SpotBugs - Static Program Analysis

### Overview
The purpose of this project is to practice static program analysis with the usage of _SonarLint_ IntelliJ IDEA plugin.

### Project structure
There is one class in this project called `SpotBugs.java`, which has 4 methods:
1. One `main` method.
2. Three methods to be changed during the task (the _"Additional Methods"_).

### Deactivate IntelliJ IDEA Inspector and SonarLint
Prior to completing the task deactivate:
1. IntelliJ IDEA _Inspect Code..._ tool:<br>
   _Tools Bar ➔ Settings ➔ Editor ➔ Inspections ➔ Uncheck 'Java' ➔ OK_.
2. SonarLint IntelliJ IDEA plugin if installed:
   _Tools Bar ➔ File ➔ Settings ➔ Tools ➔ SonarLint ➔ Uncheck 'Automatically trigger analysis' ➔ OK_.
3. Restart IntelliJ IDEA.

### Install Manually SpotBugs
Prior to completing the task install manually _SpotBugs_ IntelliJ IDEA plugin:
1. Go to https://plugins.jetbrains.com/plugin/14014-spotbugs/versions and download the latest version of SpotBugs.
2. Follow installation instructions which will appear after clicking _Download_.

### Configure SpotBugs
Configure SpotBugs the following way:<br>
_Tools Bar ➔ File ➔ Settings ➔ Tools ➔ SpotBugs ➔ Report:_<br>
-- Minimum rank: 20 - Of concern<br>
-- Minimum confidence: Low<br>
_➔ OK._

### Task description
1. Prior to completing the task run `main` method and study `SpotBugs.java` mechanism. You will see that the code works, but it has some non-critical mistakes. Your task is to correct them.
2. Every Additional Method:
    - has a mistake that can be caught by SolarLint,
    - has clues one the id of the mistake which should be corrected.
3. Correct every mistake in the Additional Methods that can be caught by SolarLint and is mentioned in the clues referring to the given method.
4. Prior to the correction of every mistake in the Additional Methods, run SolarLint and identify the mistake to be corrected in SolarLint's suggestions. Run SolarLint the following way:<br>
   _Bottom Tools Bar ➔ SolarLint ➔ Analyze with SolarLing (green arrow-button)_
5. Do not change anything in the `main` method.
6. After the correction of all the mistakes, run SolarLint and make sure that it shows no mistakes which are required to be corrected.
