from oudb.models import EntityModel, KindModel, ReferenceModel


def count_decl_method_private(ent_model=None):
    kinds = KindModel.select().where(
        KindModel._name.contains("Private") & KindModel._name.contains("Method")
    )
    ents = EntityModel.select().where(EntityModel._kind.in_(kinds))
    return (
        ents.select()
        .where(EntityModel._parent._name.contains(ent_model.name()))
        .count()
    )
