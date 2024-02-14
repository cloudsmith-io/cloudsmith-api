
# PackageDependency

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depType** | [**DepTypeEnum**](#DepTypeEnum) |  |  [optional]
**name** | **String** | The name of the package dependency. | 
**operator** | [**OperatorEnum**](#OperatorEnum) |  |  [optional]
**version** | **String** | The raw dependency version (if any). |  [optional]


<a name="DepTypeEnum"></a>
## Enum: DepTypeEnum
Name | Value
---- | -----
DEPENDS | &quot;Depends&quot;
PRE_DEPENDS | &quot;Pre-Depends&quot;
RECOMMENDS | &quot;Recommends&quot;
SUGGESTS | &quot;Suggests&quot;
ENHANCES | &quot;Enhances&quot;
REPLACES | &quot;Replaces&quot;
BREAKS | &quot;Breaks&quot;
BUILT_USING | &quot;Built-Using&quot;
BUILD_DEPENDS | &quot;Build-Depends&quot;
BUILD_DEPENDS_INDEP | &quot;Build-Depends-Indep&quot;
BUILD_CONFLICTS | &quot;Build-Conflicts&quot;
BUILD_CONFLICTS_INDEP | &quot;Build-Conflicts-Indep&quot;
CONFLICTS | &quot;Conflicts&quot;
PROVIDES | &quot;Provides&quot;
OBSOLETES | &quot;Obsoletes&quot;
REQUIRES | &quot;Requires&quot;
RUNTIME | &quot;Runtime&quot;
DEVELOPMENT | &quot;Development&quot;
COMPILE | &quot;Compile&quot;
PROVIDED | &quot;Provided&quot;
TEST | &quot;Test&quot;
SYSTEM | &quot;System&quot;
IMPORT | &quot;Import&quot;
EXCLUDED | &quot;Excluded&quot;
BUILD_REQUIRES | &quot;Build-Requires&quot;
PYTHON_REQUIRES | &quot;Python-Requires&quot;


<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
EQUAL | &quot;&#x3D;&quot;
NOT_EQUAL | &quot;!&#x3D;&quot;
LESS_THAN | &quot;&lt;&quot;
_ | &quot;&lt;&lt;&quot;
LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot;
GREATER_THAN | &quot;&gt;&quot;
__2 | &quot;&gt;&gt;&quot;
GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot;
__3 | &quot;~&#x3D;&quot;
__4 | &quot;~&gt;&quot;
MATCHES | &quot;matches&quot;



