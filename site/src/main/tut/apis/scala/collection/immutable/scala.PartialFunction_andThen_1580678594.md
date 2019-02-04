//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#andThen[C](k:B=>C):PartialFunction[A,C]">scala.PartialFunction#andThen</a></li>
<li name="scala.PartialFunction#andThen" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="andThen[C](k:B=>C):PartialFunction[A,C]"></a><a id="andThen[C]((A)⇒C):PartialFunction[Int,C]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#andThen[C](k:B=>C):PartialFunction[A,C]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">andThen</span><span class="tparams">[<span name="C">C</span>]</span><span class="params">(<span name="k">k: (<span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <span class="extype" name="scala.PartialFunction.andThen.C">C</span></span>)</span><span class="result">: <a href="../../PartialFunction.html" class="extype" name="scala.PartialFunction">PartialFunction</a>[<a href="../../Int.html" class="extype" name="scala.Int">Int</a>, <span class="extype" name="scala.PartialFunction.andThen.C">C</span>]</span> </span> <p class="shortcomment cmt"> Composes this partial function with a transformation function that gets applied to results of this partial function.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p> Composes this partial function with a transformation function that gets applied to results of this partial function.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    C
   </dt>
   <dd class="cmt">
    <p>the result type of the transformation function.</p>
   </dd>
   <dt class="param">
    k
   </dt>
   <dd class="cmt">
    <p>the transformation function</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a partial function with the same domain as this partial function, which maps arguments <code>x</code> to <code>k(this(x))</code>.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../../PartialFunction.html" class="extype" name="scala.PartialFunction">PartialFunction</a> → 
    <a href="../../Function1.html" class="extype" name="scala.Function1">Function1</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



