//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#isInstanceOf[T0]:Boolean">scala.Any#isInstanceOf</a></li>
<li name="scala.Any#isInstanceOf" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="isInstanceOf[T0]:Boolean"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#isInstanceOf[T0]:Boolean" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier">final </span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">isInstanceOf</span><span class="tparams">[<span name="T0">T0</span>]</span><span class="result">: <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span> </span> <p class="shortcomment cmt">Test whether the dynamic type of the receiver object is <code>T0</code>.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Test whether the dynamic type of the receiver object is <code>T0</code>.</p>
   <p> Note that the result of the test is modulo Scala's erasure semantics. Therefore the expression <code>1.isInstanceOf[String]</code> will return <code>false</code>, while the expression <code>List(1).isInstanceOf[List[String]]</code> will return <code>true</code>. In the latter example, because the type argument is erased as part of compilation it is not possible to check whether the contents of the list are of the specified type. </p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p><code>true</code> if the receiver object is an instance of erasure of type <code>T0</code>; <code>false</code> otherwise.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../../Any.html" class="extype" name="scala.Any">Any</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



























