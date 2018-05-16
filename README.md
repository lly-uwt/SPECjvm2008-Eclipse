# SPECjvm2008-Eclipse
Running [SPECjvm2008](https://www.spec.org/jvm2008) in the Eclipse project

## Exporting/building jar file note:
⚡ [resources](resources/) folder need to be in the same directory with the jar file in order to run.

### Options:
|Arg|Long arg|Value|Property name|Description|
|---|---|---|---|---|
|-h|--help|||Show this help.|
||--version|||Print SPECjvm2008 version and exit.|
|-sv|--showversion|||Print SPECjvm2008 version and continue.|
||--base|||Run the base compliant run of SPECjvm2008 (default, unless jvm args are specified).|
||--peak|||Run the peak compliant run of SPECjvm2008.|
||--lagom|||Run the Lagom benchmark suite, a version, of SPECjvm2008 that uses a fixed workload.|
|-pf|--propfile|string|specjvm.propfile|Use this properties file.|
|-i|--iterations|int|specjvm.miniter, specjvm.maxniter|How many iterations to run. 'inf' means an infinite number.|
|-mi|--miniter|int|specjvm.miniter|Minimum number of iterations.|
|-ma|--maxiter|int|specjvm.maxniter|Maximum number of iterations.|
|-it|--iterationtime|time|specjvm.iteration.time|How long one iteration should be. The time is specified as an integer, and assumed to be in seconds, or an integer with unit, for example 4m (4 minutes). Units available are ms, s, m and h. If the iteration time is too short, based on the warmup result, it will be adjusted to expect to finish at least 5 operations.|
|-fit|--forceIterationIime|time|specjvm.iteration.time, specjvm.iteration.time.forced|As iteration time, but the time will not be adjusted based on the warmup result.|
|-ja|--jvmArgs|string|specjvm.startup.jvm_options|JVM options used for startup subtests.|
|-jl|--jvmLauncher|path|specjvm.benchmark.startup.launcher|JVM launcher used for startup subtests.|
|-wt|--warmuptime|time|specjvm.benchmark.warmup.time|How long warmup time. The time format is the same as in iteration time.|
|-ops|--operations|int|specjvm.fixed.operations, specjvm.run.type|How many operations each iteration will consist of. It will then be a fixed workload and iteration time is ignored.|
|-bt|--benchmarkThreads|int|specjvm.benchmark.threads|How many benchmark threads to use.|
|-r|--reporter|raw file name||Invokes the reporter with given file(s). The benchmarks will not be run.|
|-v|--verbose||specjvm.print.verbose, specjvm.print.progress|Print verbose info (harness only).|
|-pja|--parseJvmArgs|||Parse jvm arguments info from command line, including heap settings (uses JMXBean info). This is not done by default.|
|-coe|--continueOnError||specjvm.continue.on.error|Continue to run suite, even if one test fails.|
|-ict|--ignoreCheckTest||specjvm.run.initial.check|Do not run check benchmark.|
|-ikv|--ignoreKitValidation||specjvm.run.checksum.validation|Do not run checksum validition of benchmark kit.|
|-crf|--createRawFile|boolean|specjvm.create.xml.report|Whether to generate a raw file.|
|-ctf|--createTextFile|boolean|specjvm.create.txt.report|Whether to generate text report. If raw is disabled, so is txt.|
|-chf|--createHtmlFile|boolean|specjvm.create.html.report|Whether to generate html report. If raw is disabled, so is html.|
|-xd|--xmlDir|path|specjvm.benchmark.xml.validation.input.dir|To set path to xml input files|
||<benchmark(s)>||specjvm.benchmarks|Name of benchmark(s) to run. By default all submission benchmarks will be selected. 'all' means all sumission benchmarks will be run. See SPECjvm2008 workload names for all values.|
