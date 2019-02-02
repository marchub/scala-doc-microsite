//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#orElse[A1<:A,B1>:B](that:PartialFunction[A1,B1]):PartialFunction[A1,B1]">scala.PartialFunction#orElse</a></li>
<li name="scala.PartialFunction#orElse" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="orElse[A1<:A,B1>:B](that:PartialFunction[A1,B1]):PartialFunction[A1,B1]"></a><a id="orElse[A1<:Int,B1>:A](PartialFunction[A1,B1]):PartialFunction[A1,B1]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#orElse[A1<:A,B1>:B](that:PartialFunction[A1,B1]):PartialFunction[A1,B1]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">orElse</span><span class="tparams">[<span name="A1">A1 &lt;: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="B1">B1 &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>]</span><span class="params">(<span name="that">that: <a href="../../PartialFunction.html" class="extype" name="scala.PartialFunction">PartialFunction</a>[<span class="extype" name="scala.PartialFunction.orElse.A1">A1</span>, <span class="extype" name="scala.PartialFunction.orElse.B1">B1</span>]</span>)</span><span class="result">: <a href="../../PartialFunction.html" class="extype" name="scala.PartialFunction">PartialFunction</a>[<span class="extype" name="scala.PartialFunction.orElse.A1">A1</span>, <span class="extype" name="scala.PartialFunction.orElse.B1">B1</span>]</span> </span> <p class="shortcomment cmt">Composes this partial function with a fallback partial function which gets applied where this partial function is not defined.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Composes this partial function with a fallback partial function which gets applied where this partial function is not defined. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    A1
   </dt>
   <dd class="cmt">
    <p>the argument type of the fallback function</p>
   </dd>
   <dt class="tparam">
    B1
   </dt>
   <dd class="cmt">
    <p>the result type of the fallback function</p>
   </dd>
   <dt class="param">
    that
   </dt>
   <dd class="cmt">
    <p>the fallback function</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a partial function which has as domain the union of the domains of this partial function and <code>that</code>. The resulting partial function takes <code>x</code> to <code>this(x)</code> where <code>this</code> is defined, and to <code>that(x)</code> where it is not.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../../PartialFunction.html" class="extype" name="scala.PartialFunction">PartialFunction</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples





























