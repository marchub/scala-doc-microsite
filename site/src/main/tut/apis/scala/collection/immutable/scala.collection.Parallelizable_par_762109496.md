//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#par:ParRepr">scala.collection.Parallelizable#par</a></li>
<li name="scala.collection.Parallelizable#par" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="par:ParRepr"></a><a id="par:ParSeq[A]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#par:ParRepr" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">par</span><span class="result">: <a href="../parallel/immutable/ParSeq.html" class="extype" name="scala.collection.parallel.immutable.ParSeq">ParSeq</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]</span> </span> <p class="shortcomment cmt">Returns a parallel implementation of this collection.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Returns a parallel implementation of this collection.</p>
   <p> For most collection types, this method creates a new parallel collection by copying all the elements. For these collection, <code>par</code> takes linear time. Mutable collections in this category do not produce a mutable parallel collection that has the same underlying dataset, so changes in one collection will not be reflected in the other one.</p>
   <p> Specific collections (e.g. <code>ParArray</code> or <code>mutable.ParHashMap</code>) override this default behaviour by creating a parallel collection which shares the same underlying dataset. For these collections, <code>par</code> takes constant or sublinear time.</p>
   <p> All parallel collections return a reference to themselves. </p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a parallel implementation of this collection</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../Parallelizable.html" class="extype" name="scala.collection.Parallelizable">Parallelizable</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



























